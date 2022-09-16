package ex11;

public class Frontend extends Tecnologia {
	private String compativel;

	public String getCompativel() {
		return compativel;
	}

	public void setCompativel(String compativel) {
		this.compativel = compativel;
	}
	
	Frontend(){}
	Frontend(int id, String LinguagemProg, String principalFramework, String descricaoLinguagem, String  descricaoFramework, String compativel){
		super(id,LinguagemProg, principalFramework, descricaoLinguagem, descricaoFramework);
		this.compativel = compativel;
	}

	@Override
	public void descricaoLinguagem() {
	}

	@Override
	public void descricaoFramework() {		
	}
}
