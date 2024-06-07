package src.IphoneUml;

public class Navegador extends iphone{
    private String siteAtual;
    private String siteAnterior;
    private String proximoSite;

    public void voltarSite(){
        this.proximoSite = this.siteAtual;
        this.siteAtual = this.siteAnterior;
        this.siteAnterior = null;
    }
    public void avançarSite(){
        this.siteAnterior = this.siteAtual;
        this.siteAtual = this.proximoSite;
        this.proximoSite = null;
    }
    public void irParaSite(String siteNovo) {
        this.siteAnterior = this.siteAtual;
        this.siteAtual = siteNovo;
        this.proximoSite = null;
    }
    public String getSiteAtual(){
        return siteAtual;
    }

    public void setSiteAnterior(String siteAnterior) {
        this.siteAnterior = siteAnterior;
    }

    public String getSiteAnterior() {
        return siteAnterior;
    }

    public String getProximoSite() {
        return proximoSite;
    }
}

