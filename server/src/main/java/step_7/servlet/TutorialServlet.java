package step_7.servlet;

import org.opendolphin.core.server.DefaultServerDolphin;
import org.opendolphin.server.adapter.DolphinServlet;
import step_7.TutorialDirector;

public class TutorialServlet extends DolphinServlet{
    @Override
    protected void registerApplicationActions(DefaultServerDolphin serverDolphin) {
        serverDolphin.register(new TutorialDirector());
    }
}
