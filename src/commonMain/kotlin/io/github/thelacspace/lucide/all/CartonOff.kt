package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CartonOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,10.0f)
                lineTo(5.0f,10.0f)
                lineTo(5.0f,20.0f)
                curveTo(5.0f,21.10457f,5.8954306f,22.0f,7.0f,22.0f)
                lineTo(17.0f,22.0f)
                curveTo(18.10457f,22.0f,19.0f,21.10457f,19.0f,20.0f)
                lineTo(19.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,22.0f)
                lineTo(13.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.902f,8.245f)
                lineTo(16.0f,6.0f)
                lineTo(11.657f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,13.343f)
                lineTo(19.0f,10.0f)
                curveTo(19.000298f,9.492448f,18.807613f,9.003767f,18.461f,8.633f)
                lineTo(16.0f,6.0f)
                lineTo(16.0f,3.0f)
                curveTo(16.0f,2.4477153f,15.552285f,2.0f,15.0f,2.0f)
                lineTo(9.0f,2.0f)
                curveTo(8.648812f,2.0002775f,8.32351f,2.1847548f,8.143f,2.486f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.034f,7.034f)
                lineTo(5.539f,8.633f)
                curveTo(5.192386f,9.003767f,4.999702f,9.492448f,5.0f,10.0f)
            }
}

public val LucideIcons.All.CartonOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CartonOff: ImageVector
    @Composable get() = CartonOffDefinition.asImageVector()
