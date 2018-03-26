/**
 * User: jeshan
 * Date: 26/03/18
 * Time: 18:53
 */

import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class TypeFormationContext extends TemplateContextType {
    protected TypeFormationContext() {
        super("TYPEFORMATION", "TypeFormation");
    }

    @Override
    public boolean isInContext(@NotNull PsiFile file, int offset) {
        return file.getName().endsWith(".yaml") || file.getName().endsWith(".yml");
    }
}
