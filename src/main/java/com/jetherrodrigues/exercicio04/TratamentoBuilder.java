package com.jetherrodrigues.exercicio04;

import java.io.Serializable;

/**
 * 
 * @author jether.rodrigues
 *
 * Using Builder with Steps
 */
public class TratamentoBuilder implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 17014213089460207L;
	private TratamentoInterface instance;
	private Builder builder = new Builder();
	
	public Builder criarSenhor(String value) {
		instance = new Senhor(value);
		return builder;
	}

	public Builder criarDoutor(String value) {
		instance = new Doutor(value);
		return builder;
	}

	/**
	 * 
	 * @author jether.rodrigues
	 * 
	 * InnerClass
	 */
	public class Builder {
		public Builder sendoReitor() {
			TituloComposite composite = new TituloComposite(instance.getTitulo(), new Reitor());
			instance.setTitulo(composite);
			return this;
		}
		
		public Builder sendoDeputado() {
			TituloComposite composite = new TituloComposite(instance.getTitulo(), new Deputado());
			instance.setTitulo(composite);
			return this;
		}
		
		public Builder de(String localizacao) {
			instance = new Localizacao(instance, localizacao);
			return this;
		}

		public TratamentoInterface builder() {
			return instance;
		}
	}
}
