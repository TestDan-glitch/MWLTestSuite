package navigation;

import net.thucydides.core.annotations.Step;

public class MWLNavigateTo {

    MWLloginPage mwlloginPage;

    @Step("Open the MWL home page")
    public void theMWLHomePage() {
        mwlloginPage.open();
    }
}
