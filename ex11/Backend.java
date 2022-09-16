package ex11;

public class Backend extends Tecnologia {
	private String posContein;

	Backend(){}
	Backend(int id, String LinguagemProg, String principalFramework, String descricaoLinguagem, String  descricaoFramework, String posContein){
		super(id, LinguagemProg, principalFramework, descricaoLinguagem, descricaoFramework);
		this.setPosContein(posContein);
	}

	@Override
	public void descricaoLinguagem() {
	}

	@Override
	public void descricaoFramework() {		
	}
	public String getPosContein() {
		return posContein;
	}
	public void setPosContein(String posContein) {
		this.posContein = posContein;
	}
}
