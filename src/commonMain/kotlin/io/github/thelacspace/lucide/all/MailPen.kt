package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.363f,17.634f)
                curveTo(15.125247f,17.871622f,14.9512205f,18.165335f,14.857f,18.488f)
                lineTo(14.02f,21.358002f)
                curveTo(13.968882f,21.533266f,14.017352f,21.72246f,14.146446f,21.851555f)
                curveTo(14.275541f,21.98065f,14.464735f,22.029121f,14.64f,21.978003f)
                lineTo(17.51f,21.141003f)
                curveTo(17.832666f,21.046782f,18.126379f,20.872755f,18.364f,20.635002f)
                lineTo(21.377f,17.626001f)
                curveTo(21.917622f,17.090195f,22.130232f,16.306082f,21.934326f,15.570568f)
                curveTo(21.73842f,14.835055f,21.163948f,14.260582f,20.428434f,14.064676f)
                curveTo(19.69292f,13.868772f,18.908808f,14.081382f,18.373001f,14.622002f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,10.38f)
                lineTo(22.0f,6.0f)
                curveTo(22.0f,4.8954306f,21.10457f,4.0f,20.0f,4.0f)
                lineTo(4.0f,4.0f)
                curveTo(2.8954306f,4.0f,2.0f,4.8954306f,2.0f,6.0f)
                lineTo(2.0f,18.0f)
                curveTo(2.0f,19.10457f,2.8954306f,20.0f,4.0f,20.0f)
                lineTo(10.25f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,7.0f)
                lineTo(13.009f,12.727f)
                curveTo(12.387915f,13.08774f,11.621085f,13.08774f,11.0f,12.727f)
                lineTo(2.0f,7.0f)
            }
}

public val LucideIcons.All.MailPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailPen: ImageVector
    @Composable get() = MailPenDefinition.asImageVector()
