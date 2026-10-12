package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,20.0)
                lineTo(20.0,20.0)
                curveTo(21.104570388793945,20.0,22.0,19.104570388793945,22.0,18.0)
                lineTo(22.0,8.0)
                curveTo(22.0,6.895430564880371,21.104570388793945,6.0,20.0,6.0)
                lineTo(12.069999694824219,6.0)
                curveTo(11.400961875915527,5.9965386390686035,10.777966499328613,5.6587700843811035,10.40999984741211,5.099999904632568)
                lineTo(9.59000015258789,3.8999998569488525)
                curveTo(9.222033500671387,3.3412294387817383,8.599038124084473,3.0034611225128174,7.929999828338623,3.0)
                lineTo(4.0,3.0)
                curveTo(2.895430564880371,3.0,2.0,3.895430564880371,2.0,5.0)
                lineTo(2.0,18.0)
                curveTo(2.0,19.100000381469727,2.9000000953674316,20.0,4.0,20.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,13.0)
                curveTo(10.998397827148438,13.358330726623535,11.188645362854004,13.690130233764648,11.49870491027832,13.869759559631348)
                curveTo(11.80876350402832,14.049389839172363,12.19123649597168,14.049389839172363,12.50129508972168,13.869759559631348)
                curveTo(12.811354637145996,13.690130233764648,13.001602172851562,13.358330726623535,13.0,13.0)
                curveTo(13.001602172851562,12.641669273376465,12.811354637145996,12.309869766235352,12.50129508972168,12.130240440368652)
                curveTo(12.19123649597168,11.950610160827637,11.80876350402832,11.950610160827637,11.49870491027832,12.130240440368652)
                curveTo(11.188645362854004,12.309869766235352,10.998397827148438,12.641669273376465,11.0,13.0)
            }
}

public val LucideIcons.All.FolderDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderDot: ImageVector
    @Composable get() = FolderDotDefinition.asImageVector()
