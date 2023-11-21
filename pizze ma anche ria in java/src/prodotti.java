public class prodotti{
    private String cibo;
    private String bevande;

    public prodotti(String cibo, String bevande) {
        this.cibo = cibo;
        this.bevande = bevande;
    }

    public String getCibo() {
        return cibo;
    }

    public void setCibo(String cibo) {
        this.cibo = cibo;
    }

    public String getBevande() {
        return bevande;
    }

    public void setBevande(String bevande) {
        this.bevande = bevande;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cibo == null) ? 0 : cibo.hashCode());
        result = prime * result + ((bevande == null) ? 0 : bevande.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        prodotti other = (prodotti) obj;
        if (cibo == null) {
            if (other.cibo != null)
                return false;
        } else if (!cibo.equals(other.cibo))
            return false;
        if (bevande == null) {
            if (other.bevande != null)
                return false;
        } else if (!bevande.equals(other.bevande))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "prodotti [cibo=" + cibo + ", bevande=" + bevande + "]";
    }
    
}
