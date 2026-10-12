package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileScan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,10.0f)
                lineTo(20.0f,8.0f)
                curveTo(20.001036f,7.360635f,19.746914f,6.747285f,19.294f,6.296f)
                lineTo(15.706f,2.708f)
                curveTo(15.254556f,2.25386f,14.640347f,1.9989595f,14.0f,2.0f)
                lineTo(6.0f,2.0f)
                curveTo(4.8954306f,2.0f,4.0f,2.8954306f,4.0f,4.0f)
                lineTo(4.0f,20.0f)
                curveTo(4.0f,21.10457f,4.8954306f,22.0f,6.0f,22.0f)
                lineTo(10.35f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,14.0f)
                curveTo(14.895431f,14.0f,14.0f,14.895431f,14.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,22.0f)
                curveTo(14.895431f,22.0f,14.0f,21.10457f,14.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,14.0f)
                curveTo(21.10457f,14.0f,22.0f,14.895431f,22.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,22.0f)
                curveTo(21.10457f,22.0f,22.0f,21.10457f,22.0f,20.0f)
            }
}

public val LucideIcons.All.FileScanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileScan: ImageVector
    @Composable get() = FileScanDefinition.asImageVector()
