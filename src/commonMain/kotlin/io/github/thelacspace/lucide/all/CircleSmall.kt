package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleSmall") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                curveTo(5.990385055541992,14.149985313415527,7.131871223449707,16.14078140258789,8.992227554321289,17.21855926513672)
                curveTo(10.852583885192871,18.296337127685547,13.147416114807129,18.296337127685547,15.007772445678711,17.21855926513672)
                curveTo(16.86812973022461,16.14078140258789,18.009614944458008,14.149985313415527,18.0,12.0)
                curveTo(18.009614944458008,9.850014686584473,16.86812973022461,7.859218597412109,15.007772445678711,6.781440734863281)
                curveTo(13.147416114807129,5.703662395477295,10.852583885192871,5.703662395477295,8.992227554321289,6.781440734863281)
                curveTo(7.131871223449707,7.859218597412109,5.990385055541992,9.850014686584473,6.0,12.0)
            }
}

public val LucideIcons.All.CircleSmallDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleSmall: ImageVector
    @Composable get() = CircleSmallDefinition.asImageVector()
