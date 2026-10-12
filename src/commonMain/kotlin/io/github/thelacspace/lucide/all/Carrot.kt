package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Carrot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,16.0)
                curveTo(16.918270111083984,14.064496040344238,16.91128921508789,10.942523956298828,14.984382629394531,9.015617370605469)
                curveTo(13.057476043701172,7.088711261749268,9.935503959655762,7.081730365753174,8.0,9.0)
                quadTo(4.0,13.0,2.013000011444092,21.385000228881836)
                curveTo(1.9729048013687134,21.5538330078125,2.0232138633728027,21.731380462646484,2.145916700363159,21.854084014892578)
                curveTo(2.2686195373535156,21.97678565979004,2.4461679458618164,22.027095794677734,2.615000009536743,21.98699951171875)
                quadTo(11.0,20.0,15.0,16.0)
                lineTo(12.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,9.0)
                quadTo(19.0,13.0,22.0,9.0)
                quadTo(19.0,5.0,15.0,9.0)
                quadTo(19.0,5.0,15.0,2.0)
                quadTo(11.0,5.0,15.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,15.0)
                lineTo(5.420000076293945,12.420000076293945)
            }
}

public val LucideIcons.All.CarrotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Carrot: ImageVector
    @Composable get() = CarrotDefinition.asImageVector()
