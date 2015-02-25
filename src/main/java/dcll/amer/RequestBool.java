package dcll.amer;

/**
 * Created by Yui on 25/02/2015.
 * Fichier ajouté pour repondre à la superIssueOne
 */
public class RequestBool {
    private Boolean b;

    public RequestBool(Boolean bool) {
        this.b = bool;
    }

    public Boolean requete() {
        return !this.b;
    }
}
