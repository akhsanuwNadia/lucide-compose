package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GermOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,2.0f)
                lineTo(11.925f,3.848f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,15.0f)
                lineTo(13.01f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.424f,7.768f)
                curveTo(13.9005375f,7.1604643f,14.68423f,6.8815055f,15.437462f,7.051299f)
                curveTo(16.190693f,7.2210927f,16.778908f,7.809306f,16.948702f,8.562538f)
                curveTo(17.118494f,9.31577f,16.839537f,10.0994625f,16.232f,10.576f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,21.0f)
                lineTo(15.0f,18.528f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.988f,16.988f)
                curveTo(14.784555f,18.93721f,11.9418545f,20.009094f,9.0f,20.0f)
                curveTo(6.7927585f,20.000746f,4.8461614f,18.554092f,4.210287f,16.440428f)
                curveTo(3.5744128f,14.326762f,4.399719f,12.04621f,6.241f,10.829f)
                curveTo(7.14463f,10.218512f,7.9269156f,9.445381f,8.548f,8.549001f)
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
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,16.0f)
                lineTo(19.526001f,13.87f)
                curveTo(20.194725f,12.6945505f,20.659945f,11.414519f,20.902f,10.084f)
                curveTo(21.384983f,7.4561515f,20.072132f,4.82557f,17.681835f,3.631696f)
                curveTo(15.291537f,2.4378219f,12.399814f,2.9683588f,10.589001f,4.9329996f)
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
}

public val LucideIcons.All.GermOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GermOff: ImageVector
    @Composable get() = GermOffDefinition.asImageVector()
