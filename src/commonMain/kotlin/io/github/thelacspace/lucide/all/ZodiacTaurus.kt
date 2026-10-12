package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacTaurus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,15.0)
                curveTo(5.990385055541992,17.149986267089844,7.131871223449707,19.14078140258789,8.992227554321289,20.21855926513672)
                curveTo(10.852583885192871,21.296337127685547,13.147416114807129,21.296337127685547,15.007772445678711,20.21855926513672)
                curveTo(16.86812973022461,19.14078140258789,18.009614944458008,17.149986267089844,18.0,15.0)
                curveTo(18.009614944458008,12.850014686584473,16.86812973022461,10.85921859741211,15.007772445678711,9.781440734863281)
                curveTo(13.147416114807129,8.703662872314453,10.852583885192871,8.703662872314453,8.992227554321289,9.781440734863281)
                curveTo(7.131871223449707,10.85921859741211,5.990385055541992,12.850014686584473,6.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,3.0)
                curveTo(17.985227584838867,6.303234577178955,15.303267478942871,8.973227500915527,12.0,8.973227500915527)
                curveTo(8.696732521057129,8.973227500915527,6.014772415161133,6.303234577178955,6.0,3.0)
            }
}

public val LucideIcons.All.ZodiacTaurusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacTaurus: ImageVector
    @Composable get() = ZodiacTaurusDefinition.asImageVector()
