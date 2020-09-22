package br.com.uol.cadastrojogador.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class DetailErrorHttp {
    private String error;
    private String errorTitle;
    private String errorMessageOfDeveloper;
    private LocalDateTime errorDate;
}
