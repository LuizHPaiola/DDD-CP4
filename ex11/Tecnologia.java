package ex11;

public abstract class Tecnologia implements TecnologiaInterface {
		private String LinguagemProg, principalFramework, descricaoLinguagem, descricaoFramework;
		private int id;
		
		public String getLinguagemProg() {
			return LinguagemProg;
		}

		public void setLinguagemProg(String linguagemProg) {
			LinguagemProg = linguagemProg;
		}

		public String getPrincipalFramework() {
			return principalFramework;
		}

		public void setPrincipalFramework(String principalFramework) {
			this.principalFramework = principalFramework;
		}

		public String getDescricaoLinguagem() {
			return descricaoLinguagem;
		}

		public void setDescricaoLinguagem(String descricaoLinguagem) {
			this.descricaoLinguagem = descricaoLinguagem;
		}

		public String getDescricaoFramework() {
			return descricaoFramework;
		}

		public void setDescricaoFramework(String descricaoFramework) {
			this.descricaoFramework = descricaoFramework;
		}
		
		Tecnologia(){}
		Tecnologia(int id, String LinguagemProg, String principalFramework, String descricaoLinguagem, String  descricaoFramework){
			this.LinguagemProg = LinguagemProg;
			this.principalFramework = principalFramework;
			this.descricaoFramework = descricaoFramework;
			this.descricaoLinguagem = descricaoLinguagem;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
}
