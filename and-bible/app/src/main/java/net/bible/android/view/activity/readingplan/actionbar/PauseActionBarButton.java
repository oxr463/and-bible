package net.bible.android.view.activity.readingplan.actionbar;

import net.bible.android.control.ApplicationScope;
import net.bible.android.control.speak.SpeakControl;
import net.bible.android.view.activity.speak.actionbarbuttons.SpeakActionBarButton;

import javax.inject.Inject;

/**
 * @author Martin Denham [mjdenham at gmail dot com]
 * @see gnu.lgpl.License for license details.<br>
 *      The copyright to this program is held by it's author.
 */
@ApplicationScope
public class PauseActionBarButton extends SpeakActionBarButton {

	@Inject
	public PauseActionBarButton(SpeakControl speakControl) {
		super(speakControl);
	}

	/**
	 *  do not show if nothing is being said.  If speaking then allow pause and vice-versa
	 */
	@Override
	public boolean canShow() {
		return super.canShow() &&
				isSpeakMode();
	}
}
