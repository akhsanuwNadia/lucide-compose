package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Images") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,11.0)
                lineTo(20.70400047302246,9.704000473022461)
                curveTo(20.253360748291016,9.249650001525879,19.639930725097656,8.994085311889648,19.0,8.994085311889648)
                curveTo(18.360071182250977,8.994085311889648,17.746641159057617,9.249650001525879,17.296001434326172,9.704000473022461)
                lineTo(11.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,8.0)
                curveTo(2.895430564880371,8.0,2.0,8.895430564880371,2.0,10.0)
                lineTo(2.0,20.0)
                curveTo(2.0,21.104570388793945,2.895430564880371,22.0,4.0,22.0)
                lineTo(14.0,22.0)
                curveTo(15.104569435119629,22.0,16.0,21.104570388793945,16.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,7.0)
                curveTo(11.998397827148438,7.358330726623535,12.188645362854004,7.690130233764648,12.49870491027832,7.869760036468506)
                curveTo(12.80876350402832,8.049389839172363,13.19123649597168,8.049389839172363,13.50129508972168,7.869760036468506)
                curveTo(13.811354637145996,7.690130233764648,14.001602172851562,7.358330726623535,14.0,7.0)
                curveTo(14.001602172851562,6.641669273376465,13.811354637145996,6.309869766235352,13.50129508972168,6.130239963531494)
                curveTo(13.19123649597168,5.950610637664795,12.80876350402832,5.950610637664795,12.49870491027832,6.130239963531494)
                curveTo(12.188645362854004,6.309869766235352,11.998397827148438,6.641669273376465,12.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(20.0,2.0)
                lineTo(22.0,2.0)
                lineTo(22.0,16.0)
                lineTo(20.0,16.0)
                lineTo(10.0,16.0)
                lineTo(8.0,16.0)
                lineTo(8.0,2.0)
                lineTo(10.0,2.0)
                close()
            }
}

public val LucideIcons.All.ImagesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Images: ImageVector
    @Composable get() = ImagesDefinition.asImageVector()
