package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileHeadphone") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,6.835f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(14.640058f,1.9984303f,15.254227f,2.2525938f,15.706f,2.7059999f)
                lineTo(19.294f,6.2939997f)
                curveTo(19.747406f,6.7457733f,20.00157f,7.359942f,20.0f,8.0f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                lineTo(17.657f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,19.0f)
                curveTo(2.0049243f,17.898922f,2.8989108f,17.008924f,4.0f,17.008924f)
                curveTo(5.101089f,17.008924f,5.9950757f,17.898922f,6.0f,19.0f)
                lineTo(6.0f,20.0f)
                curveTo(5.9950757f,21.101078f,5.101089f,21.991076f,4.0f,21.991076f)
                curveTo(2.8989108f,21.991076f,2.0049243f,21.101078f,2.0f,20.0f)
                lineTo(2.0f,16.0f)
                curveTo(2.0147727f,12.696766f,4.6967325f,10.0267725f,8.0f,10.0267725f)
                curveTo(11.3032675f,10.0267725f,13.985228f,12.696766f,14.0f,16.0f)
                lineTo(14.0f,20.0f)
                curveTo(13.995076f,21.101078f,13.1010895f,21.991076f,12.0f,21.991076f)
                curveTo(10.8989105f,21.991076f,10.004924f,21.101078f,10.0f,20.0f)
                lineTo(10.0f,19.0f)
                curveTo(10.004924f,17.898922f,10.8989105f,17.008924f,12.0f,17.008924f)
                curveTo(13.1010895f,17.008924f,13.995076f,17.898922f,14.0f,19.0f)
            }
}

public val LucideIcons.All.FileHeadphoneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileHeadphone: ImageVector
    @Composable get() = FileHeadphoneDefinition.asImageVector()
