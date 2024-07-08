package contador;

public class ValidadorParametro {
	public void validar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroUm >= parametroDois)
			throw new ParametrosInvalidosException("Erro! O valor do SEGUNDO parâmetro deve ser maior que o primeiro.");
	}
}
