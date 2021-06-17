package br.com.rabbit;

import br.com.model.RelacaoAlunos;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RelacaoAlunosProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Qualifier("relacaoalunosQueue")
    @Autowired
    private Queue queue;

    public void send(RelacaoAlunos relacaoAlunos){
        rabbitTemplate.convertAndSend(this.queue.getName(), relacaoAlunos);
    }


}






