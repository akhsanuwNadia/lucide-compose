package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Germ") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,2.0f)
                lineTo(11.925f,3.848f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,15.0f)
                lineTo(13.01f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,21.0f)
                lineTo(15.0f,18.528f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,2.0f)
                lineTo(18.0f,3.804f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,19.0f)
                lineTo(4.7460003f,17.627f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,16.0f)
                lineTo(19.526001f,13.87f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,5.0f)
                lineTo(20.196f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,10.0f)
                lineTo(5.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,16.0f)
                lineTo(9.01f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,20.0f)
                lineTo(9.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.33f,7.035f)
                curveTo(8.82f,8.513f,7.5439997f,9.965f,6.24f,10.8289995f)
                curveTo(4.398563f,12.046311f,3.5732894f,14.327127f,4.2094283f,16.440907f)
                curveTo(4.8455677f,18.554686f,6.7925725f,20.001188f,9.0f,20.0f)
                curveTo(14.8405695f,20.000355f,19.847801f,15.828643f,20.902f,10.084f)
                curveTo(21.474771f,6.995624f,19.56869f,3.9882014f,16.531311f,3.1879106f)
                curveTo(13.493933f,2.3876197f,10.353401f,4.0653567f,9.33f,7.035f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,9.0f)
                curveTo(12.996795f,9.716661f,13.377291f,10.38026f,13.997409f,10.73952f)
                curveTo(14.617528f,11.098779f,15.382472f,11.098779f,16.00259f,10.73952f)
                curveTo(16.62271f,10.38026f,17.003204f,9.716661f,17.0f,9.0f)
                curveTo(17.003204f,8.283339f,16.62271f,7.6197395f,16.00259f,7.2604804f)
                curveTo(15.382472f,6.901221f,14.617528f,6.901221f,13.997409f,7.2604804f)
                curveTo(13.377291f,7.6197395f,12.996795f,8.283339f,13.0f,9.0f)
            }
}

public val LucideIcons.All.GermDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Germ: ImageVector
    @Composable get() = GermDefinition.asImageVector()
