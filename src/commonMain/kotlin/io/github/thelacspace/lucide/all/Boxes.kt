package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Boxes") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.97f,12.92f)
                curveTo(2.3694975f,13.28078f,2.0015354f,13.929456f,2.0f,14.63f)
                lineTo(2.0f,17.87f)
                curveTo(2.001535f,18.570545f,2.3694973f,19.219221f,2.97f,19.580002f)
                lineTo(5.9700003f,21.380001f)
                curveTo(6.603865f,21.760828f,7.396136f,21.760828f,8.030001f,21.380001f)
                lineTo(12.0f,19.0f)
                lineTo(12.0f,13.5f)
                lineTo(7.0f,10.5f)
                lineTo(2.9699998f,12.92f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,16.5f)
                lineTo(2.2600002f,13.65f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,16.5f)
                lineTo(12.0f,13.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,16.5f)
                lineTo(7.0f,21.67f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,13.5f)
                lineTo(12.0f,19.0f)
                lineTo(15.97f,21.380001f)
                curveTo(16.603865f,21.760828f,17.396135f,21.760828f,18.03f,21.380001f)
                lineTo(21.03f,19.580002f)
                curveTo(21.630503f,19.219223f,21.998465f,18.570547f,22.0f,17.870003f)
                lineTo(22.0f,14.630003f)
                curveTo(21.998465f,13.929459f,21.630503f,13.280783f,21.03f,12.920003f)
                lineTo(17.0f,10.5f)
                lineTo(12.0f,13.5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,16.5f)
                lineTo(12.0f,13.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,16.5f)
                lineTo(21.74f,13.65f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,16.5f)
                lineTo(17.0f,21.67f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.97f,4.42f)
                curveTo(7.3694973f,4.78078f,7.0015354f,5.4294558f,7.0f,6.13f)
                lineTo(7.0f,10.5f)
                lineTo(12.0f,13.5f)
                lineTo(17.0f,10.5f)
                lineTo(17.0f,6.13f)
                curveTo(16.998465f,5.4294558f,16.630503f,4.78078f,16.03f,4.42f)
                lineTo(13.030001f,2.6200001f)
                curveTo(12.396136f,2.2391741f,11.603866f,2.2391741f,10.970001f,2.6200001f)
                lineTo(7.970001f,4.42f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(7.26f,5.15f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(16.74f,5.15f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,13.5f)
                lineTo(12.0f,8.0f)
            }
}

public val LucideIcons.All.BoxesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Boxes: ImageVector
    @Composable get() = BoxesDefinition.asImageVector()
