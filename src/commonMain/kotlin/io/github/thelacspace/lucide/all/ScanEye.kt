package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScanEye") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                lineTo(7.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
                lineTo(21.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,17.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(17.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,12.0)
                curveTo(10.998397827148438,12.358330726623535,11.188645362854004,12.690130233764648,11.49870491027832,12.869759559631348)
                curveTo(11.80876350402832,13.049389839172363,12.19123649597168,13.049389839172363,12.50129508972168,12.869759559631348)
                curveTo(12.811354637145996,12.690130233764648,13.001602172851562,12.358330726623535,13.0,12.0)
                curveTo(13.001602172851562,11.641669273376465,12.811354637145996,11.309869766235352,12.50129508972168,11.130240440368652)
                curveTo(12.19123649597168,10.950610160827637,11.80876350402832,10.950610160827637,11.49870491027832,11.130240440368652)
                curveTo(11.188645362854004,11.309869766235352,10.998397827148438,11.641669273376465,11.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.944000244140625,12.329999923706055)
                curveTo(19.018692016601562,12.116339683532715,19.018692016601562,11.883660316467285,18.944000244140625,11.670000076293945)
                curveTo(17.79241180419922,8.848200798034668,15.047739028930664,7.003878593444824,12.0,7.003878593444824)
                curveTo(8.952261924743652,7.003878593444824,6.207590103149414,8.848200798034668,5.056000709533691,11.670000076293945)
                curveTo(4.981308460235596,11.883660316467285,4.981308460235596,12.116339683532715,5.056000709533691,12.329999923706055)
                curveTo(6.207590103149414,15.151799201965332,8.952261924743652,16.996122360229492,12.0,16.996122360229492)
                curveTo(15.047739028930664,16.996122360229492,17.79241180419922,15.151799201965332,18.944000244140625,12.329999923706055)
            }
}

public val LucideIcons.All.ScanEyeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScanEye: ImageVector
    @Composable get() = ScanEyeDefinition.asImageVector()
