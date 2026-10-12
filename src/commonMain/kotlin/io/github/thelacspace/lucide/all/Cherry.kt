package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cherry") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,17.0)
                curveTo(2.01231050491333,19.752695083618164,4.24727725982666,21.977689743041992,7.0,21.977689743041992)
                curveTo(9.75272274017334,21.977689743041992,11.987689971923828,19.752695083618164,12.0,17.0)
                curveTo(12.0,14.239999771118164,9.5,12.0,7.0,14.0)
                curveTo(4.5,12.0,2.0,14.239999771118164,2.0,17.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                curveTo(12.012310028076172,19.752695083618164,14.24727725982666,21.977689743041992,17.0,21.977689743041992)
                curveTo(19.752723693847656,21.977689743041992,21.987689971923828,19.752695083618164,22.0,17.0)
                curveTo(22.0,14.239999771118164,19.5,12.0,17.0,14.0)
                curveTo(14.5,12.0,12.0,14.239999771118164,12.0,17.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,14.0)
                curveTo(10.220000267028809,11.09000015258789,11.289999961853027,5.25,12.0,2.0)
                curveTo(13.65999984741211,4.380000114440918,16.940000534057617,11.0,17.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,9.0)
                curveTo(17.709999084472656,9.0,14.860000610351562,6.670000076293945,12.0,2.0)
                curveTo(17.709999084472656,2.0,22.0,6.670000076293945,22.0,9.0)
                close()
            }
}

public val LucideIcons.All.CherryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cherry: ImageVector
    @Composable get() = CherryDefinition.asImageVector()
