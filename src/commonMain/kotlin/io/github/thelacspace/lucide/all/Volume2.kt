package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Volume2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,4.702000141143799)
                curveTo(10.999588012695312,4.417171001434326,10.827825546264648,4.1605706214904785,10.564654350280762,4.051627159118652)
                curveTo(10.301483154296875,3.942683219909668,9.998610496520996,4.002800941467285,9.79699993133545,4.203999996185303)
                lineTo(6.413000106811523,7.586999893188477)
                curveTo(6.149210453033447,7.852367401123047,5.790170669555664,8.001096725463867,5.415999889373779,8.0)
                lineTo(3.0,8.0)
                curveTo(2.4477152824401855,8.0,2.0,8.447714805603027,2.0,9.0)
                lineTo(2.0,15.0)
                curveTo(2.0,15.552285194396973,2.4477152824401855,16.0,3.0,16.0)
                lineTo(5.415999889373779,16.0)
                curveTo(5.790170669555664,15.998903274536133,6.149210453033447,16.147632598876953,6.413000106811523,16.413000106811523)
                lineTo(9.795999526977539,19.797000885009766)
                curveTo(9.997644424438477,19.99904441833496,10.301224708557129,20.059553146362305,10.564925193786621,19.95026206970215)
                curveTo(10.828624725341797,19.840970993041992,11.000397682189941,19.583450317382812,11.0,19.29800033569336)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,9.0)
                curveTo(17.33333396911621,10.777777671813965,17.33333396911621,13.222222328186035,16.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.36400032043457,18.36400032043457)
                curveTo(21.051851272583008,16.676170349121094,22.000078201293945,14.386967658996582,22.000078201293945,12.0)
                curveTo(22.000078201293945,9.613033294677734,21.051851272583008,7.323831081390381,19.36400032043457,5.636000633239746)
            }
}

public val LucideIcons.All.Volume2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Volume2: ImageVector
    @Composable get() = Volume2Definition.asImageVector()
