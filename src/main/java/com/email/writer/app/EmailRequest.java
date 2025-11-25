package com.email.writer.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor        // 👈 REQUIRED for JSON binding
@AllArgsConstructor
public class EmailRequest {
    private String emailContent;
    private String tone;
}
