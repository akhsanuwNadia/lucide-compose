package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SendHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.7139999866485596,3.0480000972747803)
                curveTo(3.5299408435821533,2.95814847946167,3.309638500213623,2.9901535511016846,3.1587555408477783,3.1286654472351074)
                curveTo(3.0078728199005127,3.267177104949951,2.957183599472046,3.4839444160461426,3.0309998989105225,3.6750001907348633)
                lineTo(5.87399959564209,11.302000045776367)
                curveTo(6.041672229766846,11.752228736877441,6.041672229766846,12.247771263122559,5.87399959564209,12.697999954223633)
                lineTo(3.0319995880126953,20.325000762939453)
                curveTo(2.9585609436035156,20.51580810546875,3.0092062950134277,20.73211669921875,3.1597180366516113,20.87049102783203)
                curveTo(3.310229539871216,21.008865356445312,3.5300240516662598,21.041187286376953,3.7139995098114014,20.952001571655273)
                lineTo(21.713998794555664,12.452001571655273)
                curveTo(21.88877296447754,12.369344711303711,22.000232696533203,12.19333553314209,22.000232696533203,12.000001907348633)
                curveTo(22.000232696533203,11.80666732788086,21.88877296447754,11.630658149719238,21.713998794555664,11.548001289367676)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(22.0,12.0)
            }
}

public val LucideIcons.All.SendHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SendHorizontal: ImageVector
    @Composable get() = SendHorizontalDefinition.asImageVector()
