package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinned") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,8.0f)
                curveTo(18.0f,11.613f,14.1310005f,15.429f,12.607f,16.795f)
                curveTo(12.248624f,17.068731f,11.751377f,17.068731f,11.393001f,16.795f)
                curveTo(9.87f,15.429f,6.0f,11.613f,6.0f,8.0f)
                curveTo(6.0147724f,4.6967654f,8.6967325f,2.026773f,12.0f,2.026773f)
                curveTo(15.3032675f,2.026773f,17.985228f,4.6967654f,18.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.474f,15.0f)
                lineTo(4.277f,15.0f)
                curveTo(3.819854f,15.000008f,3.4209151f,15.310019f,3.308f,15.753f)
                lineTo(2.211f,20.103f)
                curveTo(2.086897f,20.553957f,2.180252f,21.036995f,2.4634516f,21.409233f)
                curveTo(2.7466512f,21.781473f,3.1872785f,22.000305f,3.655f,22.001001f)
                lineTo(20.344f,22.0f)
                curveTo(20.811842f,21.99984f,21.25282f,21.781403f,21.536434f,21.40933f)
                curveTo(21.82005f,21.037256f,21.91382f,20.55416f,21.789999f,20.103f)
                lineTo(20.692f,15.753f)
                curveTo(20.579084f,15.310019f,20.180145f,15.000008f,19.723f,15.0f)
                lineTo(19.526f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,8.0f)
                curveTo(9.996795f,8.716661f,10.377291f,9.38026f,10.997409f,9.73952f)
                curveTo(11.617528f,10.098779f,12.382472f,10.098779f,13.002591f,9.73952f)
                curveTo(13.622709f,9.38026f,14.003205f,8.716661f,14.0f,8.0f)
                curveTo(14.003205f,7.283338f,13.622709f,6.6197395f,13.002591f,6.2604804f)
                curveTo(12.382472f,5.901221f,11.617528f,5.901221f,10.997409f,6.2604804f)
                curveTo(10.377291f,6.6197395f,9.996795f,7.283338f,10.0f,8.0f)
            }
}

public val LucideIcons.All.MapPinnedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinned: ImageVector
    @Composable get() = MapPinnedDefinition.asImageVector()
