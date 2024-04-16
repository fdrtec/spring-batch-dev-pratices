package com.fdrtec.treinomigracaodados.reader;

import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.fdrtec.treinomigracaodados.dominio.DadosBancarios;

@Configuration
public class ArquivoDadosBancariosReaderConfig {

    @Bean
    public FlatFileItemReader<DadosBancarios> dadosBancarios(){
        return new FlatFileItemReaderBuilder<DadosBancarios>()
        .resource(new FileSystemResource("files/dadosbancarios.csv"))
        .delimited()
        .names("pessoaId", "agencia", "conta", "banco", "id")
        .addComment("--")
        .targetType(DadosBancarios.class)
        .build();
    }

}
