package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Timeline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                lineTo(4.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,16.0f)
                lineTo(4.01f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,20.0f)
                lineTo(4.01f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(4.01f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,8.0f)
                lineTo(4.01f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.414f,13.414f)
                curveTo(9.788985f,13.789099f,10.297609f,13.9998865f,10.827999f,14.0f)
                lineTo(19.0f,14.0f)
                curveTo(19.552284f,14.0f,20.0f,13.552285f,20.0f,13.0f)
                lineTo(20.0f,11.0f)
                curveTo(20.0f,10.447715f,19.552284f,10.0f,19.0f,10.0f)
                lineTo(10.828f,10.0f)
                curveTo(10.29761f,10.0001135f,9.788985f,10.210901f,9.414f,10.586f)
                lineTo(8.0f,12.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.414f,21.414f)
                curveTo(9.788985f,21.789099f,10.297609f,21.999886f,10.827999f,22.0f)
                lineTo(19.0f,22.0f)
                curveTo(19.552284f,22.0f,20.0f,21.552284f,20.0f,21.0f)
                lineTo(20.0f,19.0f)
                curveTo(20.0f,18.447716f,19.552284f,18.0f,19.0f,18.0f)
                lineTo(10.828f,18.0f)
                curveTo(10.29761f,18.000113f,9.788985f,18.210901f,9.414f,18.586f)
                lineTo(8.0f,20.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.414f,5.414f)
                curveTo(9.788985f,5.7890987f,10.29761f,5.999887f,10.828f,6.0f)
                lineTo(19.0f,6.0f)
                curveTo(19.552284f,6.0f,20.0f,5.5522847f,20.0f,5.0f)
                lineTo(20.0f,3.0f)
                curveTo(20.0f,2.4477153f,19.552284f,2.0f,19.0f,2.0f)
                lineTo(10.828f,2.0f)
                curveTo(10.29761f,2.0001132f,9.788985f,2.210901f,9.414f,2.586f)
                lineTo(8.0f,4.0f)
                close()
            }
}

public val LucideIcons.All.TimelineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Timeline: ImageVector
    @Composable get() = TimelineDefinition.asImageVector()
