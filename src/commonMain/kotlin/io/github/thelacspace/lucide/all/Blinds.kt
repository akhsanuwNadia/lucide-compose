package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Blinds") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(21.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,7.0f)
                lineTo(8.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,11.0f)
                lineTo(8.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,19.0f)
                lineTo(20.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,15.0f)
                lineTo(20.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(4.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,19.0f)
                curveTo(1.9967949f,19.716661f,2.3772902f,20.38026f,2.997409f,20.73952f)
                curveTo(3.617528f,21.09878f,4.382472f,21.09878f,5.0025907f,20.73952f)
                curveTo(5.6227098f,20.38026f,6.003205f,19.716661f,6.0f,19.0f)
                curveTo(6.003205f,18.283339f,5.6227098f,17.61974f,5.0025907f,17.26048f)
                curveTo(4.382472f,16.90122f,3.617528f,16.90122f,2.997409f,17.26048f)
                curveTo(2.3772902f,17.61974f,1.9967949f,18.283339f,2.0f,19.0f)
            }
}

public val LucideIcons.All.BlindsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Blinds: ImageVector
    @Composable get() = BlindsDefinition.asImageVector()
