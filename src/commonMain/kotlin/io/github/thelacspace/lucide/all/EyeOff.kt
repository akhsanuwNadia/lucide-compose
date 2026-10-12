package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EyeOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.733f,5.076f)
                curveTo(15.520139f,4.5055084f,20.101173f,7.1936207f,21.938f,11.651f)
                curveTo(22.021341f,11.875516f,22.021341f,12.122484f,21.938f,12.347f)
                curveTo(21.570498f,13.237995f,21.084808f,14.075505f,20.494f,14.837f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.084f,14.158f)
                curveTo(12.906863f,15.29492f,11.035744f,15.278662f,9.878541f,14.121459f)
                curveTo(8.721338f,12.964256f,8.70508f,11.093137f,9.841999f,9.916f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.479f,17.499f)
                curveTo(14.794909f,19.088947f,11.552508f,19.434479f,8.593631f,18.445883f)
                curveTo(5.6347537f,17.457287f,3.2512667f,15.232081f,2.0620003f,12.348001f)
                curveTo(1.9786596f,12.123485f,1.9786596f,11.876516f,2.0620003f,11.652f)
                curveTo(2.9486325f,9.501856f,4.508673f,7.697247f,6.5080004f,6.5090003f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.EyeOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EyeOff: ImageVector
    @Composable get() = EyeOffDefinition.asImageVector()
