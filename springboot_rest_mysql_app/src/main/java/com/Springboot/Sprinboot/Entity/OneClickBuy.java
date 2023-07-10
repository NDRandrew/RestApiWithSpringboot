package com.Springboot.Sprinboot.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;


@Entity
@Data
@Table(name = "Oneclickbuy_db")
@NoArgsConstructor
@AllArgsConstructor
public class OneClickBuy{
	@Id
	@Column(name = "ID")
	@GeneratedValue
	private int id;

	@Column(name="NAME")
	private String name;

	@Column(name="endereco")
	private String endereco;

	@Column(name="Cpf")
	private String cpf;

	@Column(name="numerocartao")
	private int numerocartao;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	@Column(name = "Validade")
	private LocalDate validade;

	@Column(name = "CodigoSeguranca")
	private String codigoseguranca;

	@Column(name="Check_OCB")
	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	private boolean check_ocb;
}
