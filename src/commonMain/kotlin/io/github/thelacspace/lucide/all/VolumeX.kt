package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VolumeX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,4.702000141143799)
                curveTo(11.00462818145752,4.414749622344971,10.833274841308594,4.153834819793701,10.567831993103027,4.04395055770874)
                curveTo(10.302389144897461,3.9340667724609375,9.996756553649902,3.997525930404663,9.79699993133545,4.203999996185303)
                lineTo(6.413000106811523,7.586999893188477)
                curveTo(6.149210453033447,7.852367401123047,5.790170669555664,8.001096725463867,5.415999889373779,8.0)
                lineTo(3.0,8.0)
                curveTo(2.4477152824401855,8.0,2.0,8.447714805603027,2.0,9.0)
                lineTo(2.0,15.0)
                curveTo(2.0,15.552285194396973,2.4477152824401855,16.0,3.0,16.0)
                lineTo(5.415999889373779,16.0)
                curveTo(5.790170669555664,15.998903274536133,6.149210453033447,16.147632598876953,6.413000106811523,16.413000106811523)
                lineTo(9.795999526977539,19.797000885009766)
                curveTo(9.995766639709473,20.004369735717773,10.302139282226562,20.068256378173828,10.568137168884277,19.9580135345459)
                curveTo(10.834136009216309,19.847768783569336,11.005492210388184,19.585886001586914,11.0,19.29800033569336)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,14.5)
                lineTo(21.5,9.5)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,9.5)
                lineTo(21.5,14.5)
            }
}

public val LucideIcons.All.VolumeXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VolumeX: ImageVector
    @Composable get() = VolumeXDefinition.asImageVector()
