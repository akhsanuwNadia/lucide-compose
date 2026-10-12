package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileBox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.692000389099121,22.0)
                lineTo(18.0,22.0)
                curveTo(19.104570388793945,22.0,20.0,21.104570388793945,20.0,20.0)
                lineTo(20.0,8.0)
                curveTo(20.001569747924805,7.359942436218262,19.747406005859375,6.745773792266846,19.29400062561035,6.294000148773193)
                lineTo(15.706000328063965,2.7060000896453857)
                curveTo(15.254226684570312,2.252593755722046,14.640057563781738,1.9984302520751953,14.0,2.0)
                lineTo(6.0,2.0)
                curveTo(4.895430564880371,2.0,4.0,2.895430564880371,4.0,4.0)
                lineTo(4.0,7.803999900817871)
            }
            lucidePath(strokeWidth) {
                moveTo(2.2639999389648438,13.751999855041504)
                lineTo(7.0,16.5)
                lineTo(11.73699951171875,13.751999855041504)
            }
            lucidePath(strokeWidth) {
                moveTo(2.994999885559082,13.013999938964844)
                curveTo(2.378755807876587,13.372166633605957,1.999698519706726,14.031230926513672,2.0,14.744000434875488)
                lineTo(2.0,18.260000228881836)
                curveTo(1.9999058246612549,18.97297477722168,2.379371404647827,19.6320858001709,2.996000051498413,19.989999771118164)
                lineTo(5.996000289916992,21.729999542236328)
                curveTo(6.616832256317139,22.09035301208496,7.383167743682861,22.09035301208496,8.003999710083008,21.729999542236328)
                lineTo(11.003999710083008,19.989999771118164)
                curveTo(11.620628356933594,19.6320858001709,12.000094413757324,18.97297477722168,12.0,18.260000228881836)
                lineTo(12.0,14.743000030517578)
                curveTo(12.000301361083984,14.030231475830078,11.621244430541992,13.371167182922363,11.005000114440918,13.01300048828125)
                lineTo(8.005000114440918,11.271000862121582)
                curveTo(7.424997329711914,10.933645248413086,6.714474201202393,10.909610748291016,6.11299991607666,11.207000732421875)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,16.5)
                lineTo(7.0,22.0)
            }
}

public val LucideIcons.All.FileBoxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileBox: ImageVector
    @Composable get() = FileBoxDefinition.asImageVector()
