package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Siren") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,18.0f)
                lineTo(7.0f,12.0f)
                curveTo(6.991987f,10.208345f,7.943226f,8.549349f,9.493523f,7.651201f)
                curveTo(11.043819f,6.753052f,12.956181f,6.753052f,14.506477f,7.651201f)
                curveTo(16.056774f,8.549349f,17.008013f,10.208345f,17.0f,12.0f)
                lineTo(17.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,21.0f)
                curveTo(5.0f,21.552284f,5.4477153f,22.0f,6.0f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(18.552284f,22.0f,19.0f,21.552284f,19.0f,21.0f)
                lineTo(19.0f,20.0f)
                curveTo(19.0f,18.89543f,18.10457f,18.0f,17.0f,18.0f)
                lineTo(7.0f,18.0f)
                curveTo(5.8954306f,18.0f,5.0f,18.89543f,5.0f,20.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.5f,4.5f)
                lineTo(18.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.929f,4.929f)
                lineTo(5.6359997f,5.6359997f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,18.0f)
            }
}

public val LucideIcons.All.SirenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Siren: ImageVector
    @Composable get() = SirenDefinition.asImageVector()
