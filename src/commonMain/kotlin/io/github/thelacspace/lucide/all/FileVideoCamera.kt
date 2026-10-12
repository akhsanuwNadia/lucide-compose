package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileVideoCamera") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(4.0,4.0)
                curveTo(4.0,2.895430564880371,4.895430564880371,2.0,6.0,2.0)
                lineTo(14.0,2.0)
                curveTo(14.640057563781738,1.9984302520751953,15.254226684570312,2.252593755722046,15.706000328063965,2.7059998512268066)
                lineTo(19.29400062561035,6.293999671936035)
                curveTo(19.747406005859375,6.7457733154296875,20.001569747924805,7.3599419593811035,20.0,8.0)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,17.843000411987305)
                lineTo(13.032999992370605,16.088001251220703)
                curveTo(13.232316017150879,15.969494819641113,13.480141639709473,15.968070030212402,13.680807113647461,16.084278106689453)
                curveTo(13.88147258758545,16.200485229492188,14.003582954406738,16.4161434173584,14.0,16.648000717163086)
                lineTo(14.0,21.352001190185547)
                curveTo(13.997377395629883,21.581247329711914,13.87417984008789,21.792158126831055,13.675785064697266,21.90705108642578)
                curveTo(13.477389335632324,22.021944046020508,13.23314094543457,22.02382469177246,13.032999992370605,21.91200065612793)
                lineTo(10.0,20.156999588012695)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,16.0)
                lineTo(9.0,16.0)
                lineTo(10.0,16.0)
                lineTo(10.0,22.0)
                lineTo(9.0,22.0)
                lineTo(4.0,22.0)
                lineTo(3.0,22.0)
                lineTo(3.0,16.0)
                lineTo(4.0,16.0)
                close()
            }
}

public val LucideIcons.All.FileVideoCameraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileVideoCamera: ImageVector
    @Composable get() = FileVideoCameraDefinition.asImageVector()
