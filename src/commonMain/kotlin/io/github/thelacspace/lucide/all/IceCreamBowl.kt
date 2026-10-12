package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IceCreamBowl") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                curveTo(17.0f,17.0f,20.0f,14.309999f,20.0f,11.0f)
                lineTo(4.0f,11.0f)
                curveTo(4.0f,14.309999f,7.0f,17.0f,12.0f,17.0f)
                moveTo(8.0f,21.0f)
                lineTo(16.0f,21.0f)
                moveTo(12.0f,18.0f)
                lineTo(12.0f,21.0f)
                moveTo(5.14f,11.0f)
                curveTo(4.7142715f,9.567357f,5.2452188f,8.022454f,6.461711f,7.154205f)
                curveTo(7.678203f,6.2859554f,9.311797f,6.2859554f,10.528289f,7.154205f)
                curveTo(11.7447815f,8.022454f,12.275729f,9.567357f,11.85f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.14f,11.0f)
                curveTo(11.714272f,9.567357f,12.245219f,8.022454f,13.461711f,7.1542044f)
                curveTo(14.678204f,6.2859545f,16.311798f,6.2859545f,17.52829f,7.1542044f)
                curveTo(18.744781f,8.022454f,19.27573f,9.567357f,18.85f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5f,6.5f)
                curveTo(15.505609f,5.2458415f,14.839742f,4.084544f,13.754534f,3.4558403f)
                curveTo(12.669326f,2.8271365f,11.330674f,2.8271365f,10.245466f,3.4558403f)
                curveTo(9.160258f,4.084544f,8.494391f,5.2458415f,8.5f,6.5f)
            }
}

public val LucideIcons.All.IceCreamBowlDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IceCreamBowl: ImageVector
    @Composable get() = IceCreamBowlDefinition.asImageVector()
