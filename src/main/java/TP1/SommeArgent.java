package TP1;


public class SommeArgent {
    private final int quantite;
    private final String unite;

    public SommeArgent(int amount, String currency) {
        quantite = amount;
        unite = currency;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getUnite() {
        return unite;
    }

    public SommeArgent add(SommeArgent m) {
        return new SommeArgent(getQuantite() + m.getQuantite(), getUnite());
    }

    public SommeArgent add2(SommeArgent m) throws Exception {
        if (!m.getUnite().equals(this.getUnite())) {
            throw new Exception("Erreur : unité distincte  !");
        }
        return new SommeArgent(getQuantite() + m.getQuantite(), getUnite());
    }

    public boolean equals(Object anObject) {
        if (anObject == null) return false;
        if (anObject instanceof SommeArgent aMoney) {
            return aMoney.getUnite().equals(getUnite()) && getQuantite() == aMoney.getQuantite();
        }
        return false;
    }
}


