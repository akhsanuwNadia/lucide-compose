package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ship") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,9.189f)
                lineTo(12.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,12.0f)
                lineTo(19.0f,6.0f)
                curveTo(19.0f,4.8954306f,18.10457f,4.0f,17.0f,4.0f)
                lineTo(7.0f,4.0f)
                curveTo(5.8954306f,4.0f,5.0f,4.8954306f,5.0f,6.0f)
                lineTo(5.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.38f,19.0f)
                curveTo(20.455685f,17.184578f,21.015787f,15.110121f,21.0f,13.0f)
                lineTo(12.812f,9.361f)
                curveTo(12.295028f,9.131329f,11.704973f,9.131329f,11.188001f,9.361f)
                lineTo(3.0f,13.001f)
                curveTo(2.9537077f,15.844679f,3.9537172f,18.606272f,5.81f,20.761002f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,20.0f)
                curveTo(2.6f,20.5f,3.2f,21.0f,4.5f,21.0f)
                curveTo(7.0f,21.0f,7.0f,19.0f,9.5f,19.0f)
                curveTo(10.8f,19.0f,11.4f,19.5f,12.0f,20.0f)
                curveTo(12.6f,20.5f,13.2f,21.0f,14.5f,21.0f)
                curveTo(17.0f,21.0f,17.0f,19.0f,19.5f,19.0f)
                curveTo(20.8f,19.0f,21.4f,19.5f,22.0f,20.0f)
            }
}

public val LucideIcons.All.ShipDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ship: ImageVector
    @Composable get() = ShipDefinition.asImageVector()
