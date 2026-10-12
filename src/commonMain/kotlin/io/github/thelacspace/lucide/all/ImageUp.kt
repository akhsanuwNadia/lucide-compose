package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ImageUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.3f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,3.8954306f,3.8954306f,3.0f,5.0f,3.0f)
                lineTo(19.0f,3.0f)
                curveTo(20.10457f,3.0f,21.0f,3.8954306f,21.0f,5.0f)
                lineTo(21.0f,15.0f)
                lineTo(17.9f,11.9f)
                curveTo(17.116796f,11.132384f,15.861526f,11.138629f,15.0859995f,11.914f)
                lineTo(6.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,19.5f)
                lineTo(17.0f,16.5f)
                lineTo(20.0f,19.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,22.0f)
                lineTo(17.0f,16.5f)
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

public val LucideIcons.All.ImageUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ImageUp: ImageVector
    @Composable get() = ImageUpDefinition.asImageVector()
