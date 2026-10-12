package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pencil") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.174f,6.812f)
                curveTo(22.266592f,5.709867f,22.26284f,3.9319034f,21.165604f,2.8343928f)
                curveTo(20.068369f,1.7368822f,18.290407f,1.7326835f,17.188f,2.8249998f)
                lineTo(3.842f,16.174f)
                curveTo(3.6098194f,16.4055f,3.4381137f,16.69053f,3.342f,17.004f)
                lineTo(2.021f,21.355999f)
                curveTo(1.9683454f,21.532194f,2.0166585f,21.723072f,2.1467962f,21.853f)
                curveTo(2.276934f,21.98293f,2.4678895f,22.030937f,2.644f,21.977999f)
                lineTo(6.997f,20.657999f)
                curveTo(7.310169f,20.56275f,7.5951734f,20.392092f,7.827f,20.161f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,5.0f)
                lineTo(19.0f,9.0f)
            }
}

public val LucideIcons.All.PencilDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pencil: ImageVector
    @Composable get() = PencilDefinition.asImageVector()
