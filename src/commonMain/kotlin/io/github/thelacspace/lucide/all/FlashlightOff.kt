package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlashlightOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.652f,6.0f)
                lineTo(18.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,13.0f)
                lineTo(12.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,16.0f)
                lineTo(16.0f,20.0f)
                curveTo(16.0f,21.10457f,15.104569f,22.0f,14.0f,22.0f)
                lineTo(10.0f,22.0f)
                curveTo(8.895431f,22.0f,8.0f,21.10457f,8.0f,20.0f)
                lineTo(8.0f,12.0f)
                curveTo(8.0f,11.13452f,7.7192883f,10.292385f,7.2f,9.6f)
                lineTo(6.6f,8.8f)
                curveTo(6.2105336f,8.280711f,6.0f,7.649111f,6.0f,7.0f)
                lineTo(6.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.649f,2.0f)
                lineTo(17.0f,2.0f)
                curveTo(17.552284f,2.0f,18.0f,2.4477153f,18.0f,3.0f)
                lineTo(18.0f,7.0f)
                curveTo(18.0f,7.649111f,17.789467f,8.280712f,17.4f,8.8f)
                lineTo(16.8f,9.6f)
                curveTo(16.569225f,9.907492f,16.383987f,10.246647f,16.25f,10.607f)
            }
}

public val LucideIcons.All.FlashlightOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlashlightOff: ImageVector
    @Composable get() = FlashlightOffDefinition.asImageVector()
