package tools.dynamia.zk.addons;

import java.util.Map;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.UiException;
import org.zkoss.zk.ui.WrongValueException;
import org.zkoss.zul.SimpleConstraint;

public class GrammarConstraint extends SimpleConstraint {

	private static final long serialVersionUID = 1L;

	public static final int GRAMMAR_STRICT = 0x0005;

	public static final int GRAMMAR_LENIENT = 0x0006;

	public GrammarConstraint(String constraint) {
		super(constraint);
	}

	@Override
	public void validate(Component comp, Object value) throws WrongValueException {
		boolean strict = (_flags & GRAMMAR_STRICT) != 0;
		boolean lenient = (_flags & GRAMMAR_LENIENT) != 0;
		if (comp instanceof Aceditor && (strict || lenient)) {
			final Aceditor aceditor = (Aceditor) comp;
			if (aceditor.annotations != null && aceditor.annotations.size() > 0) {
				final StringBuffer issues = new StringBuffer();
				for (Map<String, Object> annotation : aceditor.annotations) {
					if ("error".equals(annotation.get("type")) || strict) {
						if (issues.length() > 0) issues.append(" ");
						issues.append(annotation.get("text"));
						issues.append(" (line ");
						issues.append(annotation.get("row"));
						issues.append(")");
					}
				}
				if (issues.length() > 0) {
					throw new WrongValueException(aceditor, issues.toString());
				}
			}
		}
		super.validate(comp, value);
	}
	
	@Override
	protected int parseConstraint(String constraint) throws UiException {
		if (constraint.equals("grammar(strict)")) {
			return GRAMMAR_STRICT;
		} else if (constraint.equals("grammar(lenient)")) {
			return GRAMMAR_LENIENT;
		} else {
			return super.parseConstraint(constraint);
		}
	}
}
