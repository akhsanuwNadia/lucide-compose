package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ImagePlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,5.0f)
                lineTo(22.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,2.0f)
                lineTo(19.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,11.5f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,3.8954306f,3.8954306f,3.0f,5.0f,3.0f)
                lineTo(12.5f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,15.0f)
                lineTo(17.914f,11.914f)
                curveTo(17.133f,11.133236f,15.867f,11.133236f,15.0859995f,11.914f)
                lineTo(6.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,9.0f)
                curveTo(6.996795f,9.716661f,7.3772902f,10.38026f,7.9974093f,10.73952f)
                curveTo(8.617528f,11.098779f,9.382472f,11.098779f,10.002591f,10.73952f)
                curveTo(10.622709f,10.38026f,11.003205f,9.716661f,11.0f,9.0f)
                curveTo(11.003205f,8.283339f,10.622709f,7.6197395f,10.002591f,7.2604804f)
                curveTo(9.382472f,6.901221f,8.617528f,6.901221f,7.9974093f,7.2604804f)
                curveTo(7.3772902f,7.6197395f,6.996795f,8.283339f,7.0f,9.0f)
            }
}

public val LucideIcons.All.ImagePlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ImagePlus: ImageVector
    @Composable get() = ImagePlusDefinition.asImageVector()
