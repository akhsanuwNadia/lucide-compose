package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScrollText") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,12.0f)
                lineTo(10.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,8.0f)
                lineTo(10.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,17.0f)
                lineTo(19.0f,5.0f)
                curveTo(19.0f,3.8954306f,18.10457f,3.0f,17.0f,3.0f)
                lineTo(4.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,21.0f)
                lineTo(20.0f,21.0f)
                curveTo(21.10457f,21.0f,22.0f,20.10457f,22.0f,19.0f)
                lineTo(22.0f,18.0f)
                curveTo(22.0f,17.447716f,21.552284f,17.0f,21.0f,17.0f)
                lineTo(11.0f,17.0f)
                curveTo(10.447715f,17.0f,10.0f,17.447716f,10.0f,18.0f)
                lineTo(10.0f,19.0f)
                curveTo(10.003205f,19.716661f,9.622709f,20.38026f,9.002591f,20.73952f)
                curveTo(8.382472f,21.09878f,7.617528f,21.09878f,6.9974093f,20.73952f)
                curveTo(6.3772902f,20.38026f,5.996795f,19.716661f,6.0f,19.0f)
                lineTo(6.0f,5.0f)
                curveTo(6.003205f,4.283338f,5.6227098f,3.6197395f,5.0025907f,3.2604802f)
                curveTo(4.382472f,2.9012208f,3.617528f,2.9012208f,2.997409f,3.2604802f)
                curveTo(2.3772902f,3.6197395f,1.9967949f,4.283338f,2.0f,5.0f)
                lineTo(2.0f,7.0f)
                curveTo(2.0f,7.5522847f,2.4477153f,8.0f,3.0f,8.0f)
                lineTo(6.0f,8.0f)
            }
}

public val LucideIcons.All.ScrollTextDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScrollText: ImageVector
    @Composable get() = ScrollTextDefinition.asImageVector()
