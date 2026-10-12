package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Biohazard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,11.9f)
                curveTo(9.996795f,12.616661f,10.377291f,13.28026f,10.997409f,13.63952f)
                curveTo(11.617528f,13.998778f,12.382472f,13.998778f,13.002591f,13.63952f)
                curveTo(13.622709f,13.28026f,14.003205f,12.616661f,14.0f,11.9f)
                curveTo(14.003205f,11.183338f,13.622709f,10.519739f,13.002591f,10.16048f)
                curveTo(12.382472f,9.801221f,11.617528f,9.801221f,10.997409f,10.16048f)
                curveTo(10.377291f,10.519739f,9.996795f,11.183338f,10.0f,11.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.7f,3.4f)
                curveTo(5.7999997f,5.9f,6.7f,8.6f,8.9f,10.1f)
                curveTo(6.5f,9.0f,3.7f,9.6f,2.0f,11.6f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.9f,10.1f)
                lineTo(10.299999f,10.900001f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.3f,3.4f)
                curveTo(18.199999f,5.9f,17.3f,8.6f,15.099999f,10.1f)
                curveTo(17.5f,8.900001f,20.3f,9.5f,22.0f,11.6f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.1f,10.1f)
                lineTo(13.700001f,10.900001f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.7f,20.8f)
                curveTo(14.1f,20.4f,12.1f,18.199999f,12.000001f,15.499999f)
                curveTo(11.800001f,18.099998f,9.900002f,20.3f,7.300001f,20.699999f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,13.9f)
                lineTo(12.0f,15.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5f,5.4f)
                curveTo(12.5f,5.2000003f,11.5f,5.2000003f,10.5f,5.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,16.4f)
                curveTo(17.7f,15.7f,18.2f,14.799999f,18.5f,13.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.5f,13.9f)
                curveTo(5.8f,14.799999f,6.3f,15.7f,7.0f,16.4f)
            }
}

public val LucideIcons.All.BiohazardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Biohazard: ImageVector
    @Composable get() = BiohazardDefinition.asImageVector()
