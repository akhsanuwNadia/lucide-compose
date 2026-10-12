package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Spotlight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.295f,19.562f)
                lineTo(16.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,16.0f)
                lineTo(20.758f,18.098f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,12.5f)
                lineTo(22.026001f,11.902f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.61f,6.3f)
                curveTo(6.1655445f,5.62182f,4.442969f,6.1930823f,3.69f,7.6000004f)
                lineTo(2.31f,10.39f)
                curveTo(1.6382046f,11.831869f,2.2085955f,13.54743f,3.61f,14.3f)
                lineTo(10.5f,17.897f)
                curveTo(10.737227f,18.015738f,11.011913f,18.035347f,11.263602f,17.951513f)
                curveTo(11.515291f,17.867678f,11.723354f,17.687273f,11.842f,17.449999f)
                lineTo(14.948f,11.238998f)
                curveTo(15.194587f,10.745235f,14.994527f,10.145057f,14.501f,9.897999f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,9.0f)
                lineTo(8.0f,2.0f)
            }
}

public val LucideIcons.All.SpotlightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Spotlight: ImageVector
    @Composable get() = SpotlightDefinition.asImageVector()
