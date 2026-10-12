package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,11.693f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,22.0f)
                lineTo(20.125f,20.125f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                curveTo(3.000484f,13.617424f,6.8474784f,14.943547f,11.697f,14.998f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(3.0f,19.0f)
                curveTo(2.9996324f,19.811914f,3.9865394f,20.589209f,5.735328f,21.154362f)
                curveTo(7.484117f,21.719515f,9.845436f,22.02426f,12.28f,21.999f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,18.0f)
                curveTo(14.995193f,19.074993f,15.565935f,20.07039f,16.496113f,20.60928f)
                curveTo(17.426292f,21.148169f,18.573708f,21.148169f,19.503887f,20.60928f)
                curveTo(20.434065f,20.07039f,21.004808f,19.074993f,21.0f,18.0f)
                curveTo(21.004808f,16.925007f,20.434065f,15.929609f,19.503887f,15.39072f)
                curveTo(18.573708f,14.851831f,17.426292f,14.851831f,16.496113f,15.39072f)
                curveTo(15.565935f,15.929609f,14.995193f,16.925007f,15.0f,18.0f)
            }
}

public val LucideIcons.All.DatabaseSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseSearch: ImageVector
    @Composable get() = DatabaseSearchDefinition.asImageVector()
