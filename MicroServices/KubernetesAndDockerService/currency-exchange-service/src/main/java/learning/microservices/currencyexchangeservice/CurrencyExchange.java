package learning.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class CurrencyExchange {

@Id
 private Long  id;
@Column(name = "currency_from")
 private String from;
@Column(name = "currency_to")
 private String to;
 private BigDecimal coversionMultiple;
 private String environment;
 
}
