package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.75f,7.09f)
                curveTo(13.810103f,7.3620896f,14.637911f,8.189897f,14.91f,9.25f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.072f,17.072f)
                curveTo(15.438001f,19.242f,13.545f,20.984001f,12.601f,21.799f)
                curveTo(12.245038f,22.066668f,11.754962f,22.066668f,11.399f,21.799f)
                curveTo(9.539f,20.193f,4.0f,14.993f,4.0f,10.0f)
                curveTo(3.9998827f,8.366861f,4.499595f,6.772807f,5.432f,5.432f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.475f,2.818f)
                curveTo(10.954639f,1.6008879f,13.886734f,1.7490633f,16.23104f,3.2099566f)
                curveTo(18.575344f,4.67085f,20.000162f,7.2377596f,20.0f,10.0f)
                curveTo(20.0f,11.183f,19.69f,12.377f,19.19f,13.533f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.13f,9.13f)
                curveTo(8.809817f,10.18869f,9.098135f,11.337677f,9.880229f,12.119771f)
                curveTo(10.662323f,12.901865f,11.81131f,13.190183f,12.87f,12.87f)
            }
}

public val LucideIcons.All.MapPinOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinOff: ImageVector
    @Composable get() = MapPinOffDefinition.asImageVector()
